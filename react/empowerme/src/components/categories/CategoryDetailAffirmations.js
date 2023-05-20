import React, {Fragment} from 'react';
import { Link } from 'react-router-dom';
import Affirmation from '../affirmations/Affirmation';

const CategoryDetailAffirmations = ({category, affirmations}) => {

    if (!category){
        return <p>Loading...</p>
    }

    const url = "/categories/" + category.id

    const affirmationElements = affirmations.map((affirmation, index) => {
        if(affirmation.category.id === category.id){
        return (
            <li key={index} className='category-item'>
            <div>
                <Affirmation affirmation={affirmation}/>
            </div>
            </li>
        )}
    })

    return (
    <Fragment>
        <p>
            <Link to={url} className='category-link'>
            Category: {category.title}
            </Link>
            {affirmationElements}
        </p>
    </Fragment>
    )
}

export default CategoryDetailAffirmations