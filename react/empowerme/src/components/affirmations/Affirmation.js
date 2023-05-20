import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';


const Affirmation = ({ affirmation }) => {

  if (!affirmation) {
    return 'Loading...';
  }

  const url = '/affirmations/' + affirmation.id;


  return (
    <div>
    <Fragment>
    <div className='affirmation-select'>
      <h1>
        <Link to={url}>
          {affirmation.category.title}
        </Link>
      </h1>
     
      <div className='affirmation-text'>
      <p>
        {affirmation.sentence} 
      </p>
      </div>
    </div>
    </Fragment>
    </div>
  );
};

export default Affirmation;