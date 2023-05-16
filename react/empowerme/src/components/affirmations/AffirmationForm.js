import React, { Fragment, useState } from 'react';

const AffirmationForm = ({ categories, onCreate }) => {
  const [stateDiary, setStateDiary] = useState({
    title: '',
    category: null,
  });

  if (!categories.length === 0) {
    return <p>Loading...</p>;
  }

  const handleChange = function (event) {
    let propertyName = event.target.name;
    let copiedDiary = { ...stateDiary };
    copiedDiary[propertyName] = event.target.value;
    console.log('copied diary: ' + copiedDiary)
    setStateDiary(copiedDiary);
  };

  const handleCategory = function (event) {
    const index = parseInt(event.target.value);
    const selectedCategory = categories[index];
    let copiedDiary = { ...stateDiary };
    copiedDiary['category'] = selectedCategory;
    setStateDiary(copiedDiary);
  };

  const handleSubmit = function (event) {
    event.preventDefault();
    onCreate(stateDiary);
  };

  const categoryOptions = categories.map((category, index) => {
    return (
      <option key={index} value={index}>
        {category.name}
      </option>
    );
  });

  return (
    <div className='Selecting-Category'>
      <form onSubmit={handleSubmit}>
        <input
          type='text'
          placeholder='Diary Entry'
          name='title'
          onChange={handleChange}
          value={stateDiary.title}
          className='diary-entry-placeholder'
        />

        <select
          name='category'
          onChange={handleCategory}
          defaultValue='select-category'
          className='dropdown-select'
        >
          <option disabled value='select-category'>
            Select a category
          </option>
          {categoryOptions}
        </select>

        <button type='submit'>
          Save
        </button>
      </form>
    </div>
  );
};

export default AffirmationForm;
