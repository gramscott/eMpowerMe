import React from 'react'
import Diary from './Diary'

const DiaryDetail = ({ diary, handleDelete }) => {

    const onDelete = () => {
        handleDelete(diary.id)
    }
    
    return (
    
        <div>
            <Diary diary={diary} />
            <button onClick={onDelete} className='delete-diary'>DELETE</button>
        </div>
    
    )

}

export default DiaryDetail