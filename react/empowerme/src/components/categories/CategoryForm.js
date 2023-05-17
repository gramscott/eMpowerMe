import React, { useState } from 'react'

const CategoryForm = ({onCreate}) => {
    
    const [stateCategory, setStateCategory] = useState(
        {
            title:""
        }
    )

    const handleSubmit = function(event){
        event.preventDefault();
        onCreate(stateCategory);
    }

    const handleChange = function(event){
        let propertyName = event.target.name;
        let copiedCategory = {...stateCategory}
        copiedCategory[propertyName] = event.target.value;
        setStateCategory(copiedCategory)
        }
    
    return (
        <div>
        <form onSubmit={handleSubmit}>
    
        <input type="text" className='category-name' placeholder="Category name" name="title" onChange={handleChange} value={stateCategory.title} />    
        <button className='category-button' type="submit">Add New Category</button>
        </form>
        </div>
    )
}

export default CategoryForm;