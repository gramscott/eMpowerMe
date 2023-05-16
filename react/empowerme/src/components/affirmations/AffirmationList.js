import React from 'react';
import Affirmation from './Affirmation.js';
import Slider from 'react-slick';
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import AffirmationForm from './AffirmationForm.js';


const AffirmationList = ({affirmations, categories, diaries, handlePost, handleForumPost}) => {

    if (affirmations.length ===0){
        return (<p>Loading...</p>)
    }

    const affirmationElements = affirmations.map((affirmation, index) => {
      console.log('affirmation elements in AffirmationList: ' + affirmation.sentence);
        return (
            <div key = {index}>
                <Affirmation affirmation={affirmation} />
            </div>
        )
      
    })

    const settings = {
        dots: true,
        infinite: true,
        speed: 500,
        slidesToShow: 1,
        slidesToScroll: 1,
      };




	return (
        
            <div className='Slides'>
              <Slider {...settings}>
                {affirmationElements} 
              </Slider>
              <br/>
              <AffirmationForm affirmations={affirmations} categories={categories} onCreate={handlePost}/>
            </div>
          );

}
  export default AffirmationList;