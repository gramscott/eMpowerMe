import React from 'react';
import Affirmation from './Affirmation';

const AffirmationDetail = ({affirmation, handleDelete }) => {

    if(affirmation){
      
      const affirmationsDiaries = affirmation.diaries.map((diary, index) => {
            return <li key={index}>{diary.post}</li>
        })


        const onDelete = () => {
          handleDelete(affirmation.id)
        }

  return (
    <div className='a-particular-affirmations-comments'>
        <Affirmation affirmation={affirmation}/>
        <p>Comments:</p>
        <ul>
            {affirmationsDiaries}
        </ul>

        <button className='delete-button-comments' onClick={onDelete}>DELETE</button>
    </div>
  )
}

return(
    <p>Loading...</p>
)

}

export default AffirmationDetail;
