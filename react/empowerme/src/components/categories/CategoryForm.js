import React, { useState } from 'react'

const CategoryForm = ({onCreate}) => {
    
    const [stateCategory, setStateCategory] = useState(
        {
            name:""
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
    
        <input type="text" className='category-name' placeholder="Category name" name="name" onChange={handleChange} value={stateCategory.name} />    
        <button className='category-button' type="submit">Add New Category</button>
        </form>
        </div>
    )
}

export default CategoryForm;