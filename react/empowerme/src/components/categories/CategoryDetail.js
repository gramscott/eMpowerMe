import React from 'react';
import CategoryDetailAffirmations from './CategoryDetailAffirmations';

const CategoryDetail = ({category, affirmations, handleDelete}) => {
    

    const onDelete = () => {
        handleDelete(category.id)
    }

    

    return (
    <div>
        <CategoryDetailAffirmations category={category} affirmations={affirmations}/>
        <button className='category-delete' onClick={onDelete}>Delete</button>
    </div>
    )
}

export default CategoryDetail;