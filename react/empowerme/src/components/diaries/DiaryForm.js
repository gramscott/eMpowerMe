import React, { useState } from 'react'

const DiaryForm = ({onCreate}) => {

    const [stateDiary, setStateDiary] = useState(
        {
            entry:""
        }
    )

    const handleSubmit = function(event){
        event.preventDefault();
        onCreate(stateDiary);
    }

    const handleChange = function(event){
        let propertyName = event.target.name;
        let copiedDiary = {...stateDiary};
        copiedDiary[propertyName] = event.target.value;
        setStateDiary(copiedDiary)
    }

    return (
    <div>
        <form onSubmit={handleSubmit}>
            <input type="text" placeholder="Entry" name="entry" onChange={handleChange} value={stateDiary.entry}/>
            <button type="Submit" >Save Entry</button>
        </form>
    </div>
    )
}

export default DiaryForm
