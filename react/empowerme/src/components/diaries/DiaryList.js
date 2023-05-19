import React from 'react';
import Diary from './Diary.js';
import DiaryForm from './DiaryForm.js';

const DiaryList = (props, handlePost) => {

    if(props.diaries.length === 0) {
        return (<p>Loading...</p>)
    }
    
    const diaryElements = props.diaries.map((diary) => {
            return (<li key={diary.id} className="component-item">
                <Diary diary={diary} />
            </li>
        )
        })
    
    return (
        <ul className="component-list">
            {diaryElements}
            <br/><DiaryForm diaries={props.diaries} onCreate={handlePost}/>
        </ul>
    
    )
}

export default DiaryList;