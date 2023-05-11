import React from 'react'
import Category from './Category'
import CategoryForm from './CategoryForm'

const CategoryList = ({categories, handlePost}) => {

if (categories.length ===0){
    return (<p>Loading...</p>)
}

const categoryElements = categories.map((category, index) => {
    return (
        <li key={index} className='component-item'>
            <div className='component'>
                <Category category={category}/>
            </div>
        </li>
    )
})



    return (

    <ul className='component-list'>

        {categoryElements}
        <CategoryForm categories={categories} onCreate={handlePost}/>

    </ul>

    )
}

export default CategoryList;
