import React, {Fragment} from 'react';
import { Link } from 'react-router-dom';

const Category = ({category}) => {

    if (!category){
        return <p>Loading...</p>
    }

    const url = "/categories/" + category.id

    return (
    <Fragment>
        <p>
            <Link to={url}>
            {category.title}
            </Link>
        </p>
    </Fragment>
    )
}

export default Category