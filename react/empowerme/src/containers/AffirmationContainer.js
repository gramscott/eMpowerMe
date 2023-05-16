import React, { Component, Fragment, useEffect, useState } from 'react';
import { BrowserRouter as Router, Route, Switch, Routes, useParams } from "react-router-dom";
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
            console.log(data);
            console.log('data 0: ' + data[0][0].sentence)
            setAffirmations(data[0])
            setCategories(data[1])
            setDiaries(data[2])
        })
    }, [])
    

    const getAffirmations = () => {
        const request = new Request()
        request.get("/api/affirmations")
        .then((data) => {
          console.log('data in getAffirmations: ' + data)
          setAffirmations(data)
        })
      }
  
      const findAffirmationById = (id) => {
        return affirmations.find((affirmation) => {
          return affirmation.id === parseInt(id);
        })
      }
  
      const AffirmationDetailWrapper = () => {
        const { id } = useParams();
        let foundAffirmation = findAffirmationById(id)
        return <AffirmationDetail affirmation={foundAffirmation} handleDelete={handleDelete} />
      };
  
      const handleDelete = (id) => {
          const request = new Request();
          const url = '/api/affirmations/' + id;
          request.delete(url).then(()=> {
              window.location = '/affirmations';
          })
        
      }
  
      const handlePost = (affirmation) => {
          const request = new Request();
          request.post('/api/affirmations/', affirmation).then(() => {
            window.location = '/affirmations'
          })
      }
  
      
  return (
    <div>
    <Routes>
        <Route path="/new" element={
          <AffirmationForm affirmations={affirmations} onCreate={handlePost}/>
        }/>
        <Route path="/:id" element={
            <AffirmationDetailWrapper/>
        }/>
        <Route path="/" element={<AffirmationList affirmations={affirmations} categories={categories} handlePost={handlePost}/>}/>
    </Routes>
</div>

  )
}

export default AffirmationContainer