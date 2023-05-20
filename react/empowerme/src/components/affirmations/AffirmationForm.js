
import React, {useState} from 'react'

const AffirmationForm = ({categories, onCreate}) => {

  const[stateAffirmation, setStateAffirmation] = useState(
    {
      title:"",
      category: null
    }
  )

  if (!categories.length === 0){
    return <p>Loading... </p>
  }


  const handleChange = function(event){
    let propertyName = event.target.name;
    let copiedAffirmation = {...stateAffirmation}
    copiedAffirmation[propertyName] = event.target.value;
    setStateAffirmation(copiedAffirmation)
  }


  const handleCategory = function (event){
    const index = parseInt(event.target.value)
    const selectedCategory = categories[index]
    let copiedAffirmation = {...stateAffirmation};
    copiedAffirmation['category'] = selectedCategory; 
    setStateAffirmation(copiedAffirmation)
  }


  const handleSubmit = function(event){
    event.preventDefault();
    onCreate(stateAffirmation);
  }

  const categoryOptions = categories.map((category, index) => {
    return <option key={index} value={index}>{category.title}</option>
    
  })

  return (
    <div className='Selecting-Category'>
    <form onSubmit={handleSubmit}>

    <input type="text" placeholder="Affirmation" name="title" onChange={handleChange} value={stateAffirmation.title} className='affirmation-placeholder'/>

    <select name='category' onChange={handleCategory} defaultValue="select-category" className='dropdown-select'>
      <option disabled value='select-category'>Select a category</option>
      {categoryOptions}

    </select>

    <button type="submit" className='save-new-affirmation'>Save</button>
    </form>
    </div>
)

}

export default AffirmationForm;