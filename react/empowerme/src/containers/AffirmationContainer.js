import React, { useEffect, useState } from 'react';
import { BrowserRouter as Router, Route, Routes, useParams } from "react-router-dom";
import AffirmationForm from '../components/affirmations/AffirmationForm';
import AffirmationDetail from '../components/affirmations/AffirmationDetail';
import AffirmationList from '../components/affirmations/AffirmationList';
import Request from '../helpers/request';

const AffirmationContainer = () => {
    
    const [affirmations, setAffirmations] = useState([])
    const [categories, setCategories] = useState([])
    const [diaries, setDiaries] = useState([])

    useEffect(() => {
        const request = new Request();
    
        const affirmationPromise = request.get('/api/affirmations');
        const categoryPromise = request.get('/api/categories');
        const diaryPromise = request.get('/api/diaries');
        
        Promise.all([affirmationPromise, categoryPromise, diaryPromise])
        .then((data) => {
            // console.log('data 0: ' + data[0][0].sentence)
            // console.log('data 1: ' + data[1][1].title)
            // console.log('data 2: ' + data[2][2].post)
            setAffirmations(data[0])
            setCategories(data[1])
            setDiaries(data[2])
        })
    }, [])

    // The findAffirmationById function in the AffirmationContainer component is used to find a specific affirmation from the affirmations array based on its ID.   
  
      const findAffirmationById = (id) => {
        return affirmations.find((affirmation) => {
            return affirmation.id === parseInt(id);
        });
    };

    // The AffirmationDetailWrapper is a functional component within the AffirmationContainer component. It is responsible for rendering the AffirmationDetail component with the appropriate affirmation data based on the ID extracted from the URL parameters.
  
      const AffirmationDetailWrapper = () => {
        const { id } = useParams();
        let foundAffirmation = findAffirmationById(id)
        return <AffirmationDetail affirmation={foundAffirmation} handleDelete={handleDelete} />
      };

      //  The handleDelete function is responsible for handling the deletion of an affirmation. It is triggered when the user initiates a delete action within the AffirmationDetail component.
  
      const handleDelete = (id) => {
          const request = new Request();
          const url = '/api/affirmations/' + id;
          request.delete(url).then(()=> {
              window.location = '/affirmations';
          })
        
      }


// The handlePost function is responsible for sending a POST request to the server to create a new affirmation. Here's an explanation of how the function works:


  
      const handlePost = (affirmation) => {
          const request = new Request();
          request.post('/api/affirmations/', affirmation).then(() => {
            window.location = '/affirmations'
          })
      }
  

      // 



      
  return (
    <div>
    <Routes>

       {/* 1. the AffirmationForm component is being rendered when the /new path is matched, allowing users to create new affirmations.. Passing down affirmations so it can be created! The onCreate prop is a callback function that is also passed to the AffirmationForm component, which the form can invoke to handle the creation of a new affirmation. */}

        <Route path="/new" element={
          <AffirmationForm affirmations={affirmations} onCreate={handlePost}/>
        }/>

        {/* {/* 2. This route captures the ID parameter in the URL and uses it to display the details of a specific affirmation. The AffirmationDetailWrapper component is rendered, which retrieves the corresponding affirmation based on the ID and passes it as a prop to the AffirmationDetail component for rendering. */}

        <Route path="/:id" element={
            <AffirmationDetailWrapper/>
        }/>

        {/* 3. This route represents the home page or the default page for displaying a list of affirmations. The AffirmationList component is rendered, which receives the affirmations, categories, and diaries as props. It also receives the handlePost function to enable creating new affirmations. The component is responsible for rendering the list of affirmations and providing the necessary functionality. */}

        <Route path="/" element={<AffirmationList affirmations={affirmations} categories={categories} diaries={diaries} handlePost={handlePost}/>}/>
    </Routes>
</div>

  )
}

export default AffirmationContainer