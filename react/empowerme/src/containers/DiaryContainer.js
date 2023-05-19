import React, { Component, Fragment, useEffect, useState } from 'react';
import { BrowserRouter as Router, Route, Switch, Routes, useParams } from "react-router-dom";
import Request from '../helpers/request';
import DiaryList from '../components/diaries/DiaryList'
import DiaryForm from '../components/diaries/DiaryForm';
import DiaryDetail from '../components/diaries/DiaryDetail';

const DiaryContainer = () => {

    const [affirmations, setAffirmations] = useState([])
    const [categories, setCategories] = useState([])
    const [diaries, setDiaries] = useState([])

    useEffect(() => {
        const request = new Request();

        const affirmationPromise = request.get('/api/affirmations');
        const categoryPromise = request.get('/api/categories');
        const diaryPromise = request.get('/api/diaries');
        
        Promise.all([affirmationPromise, categoryPromise, diaryPromise])
        .then((data) => {
            setAffirmations(data[0])
            setCategories(data[1])
            setDiaries(data[2])
        })
    }, [])

    const findDiaryById = (id) => {
        return diaries.find((diary) => {
            return diary.id === parseInt(id);
        })
    }

    const handlePost = (diary) => {
        const request = new Request();
        request.post('/api/diaries/', diary).then(() => {
        window.location = '/diaries'
        })
    }

    const handleDelete = (id) => {
        const request = new Request();
        const url = '/api/diaries/' + id
        request.delete(url).then(() => {
            window.location = '/diaries'
        })
    }

    const DiaryDetailWrapper = () => {
        const { id } = useParams();
        let foundDiary = findDiaryById(id)
        return <DiaryDetail diary={foundDiary} handleDelete={handleDelete} />
    }

    return (
    <div>

        <Routes>
        <Route path="/new" element={
          <DiaryForm diaries={diaries} onCreate={handlePost}/>
        }/>
            <Route path="/" element={
                <DiaryList diaries={diaries} handlePost={handlePost}/>
            }/>
            <Route path="/:id" element={
                <DiaryDetailWrapper/>
            } />
        </Routes>

    </div>
    )
}

export default DiaryContainer
