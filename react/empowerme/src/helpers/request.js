class Request {

  // The get function in the Request.js file is an asynchronous function that performs a GET request to a specified URL

    async get(url){
        const res = await fetch("http://localhost:8080"+ url);
        return res.json();
    }

    // The delete function in the Request.js file is responsible for making a DELETE request to the specified URL using the Fetch API. It sends a request to the server to delete a resource identified by the provided URL.

    delete(url) {
        return fetch(url, {
          method: "DELETE",
          headers: {'Content-Type': 'application/json'}
        })
      } 

      // The post function in the Request.js file is responsible for making a POST request to the specified URL with a payload using the Fetch API. It sends a request to the server to create a new resource with the provided data.


    post(url, payload){
      return fetch(url, {
        method: "POST",
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(payload)
      })
    }
    




}

export default Request;