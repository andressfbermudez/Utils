function makeRequest() {
    const url = document.getElementById('apiUrl').value;

    fetch(url, { 
        method: 'GET',  
        headers: {
            'Content-Type': 'application/json',
        }
    })
    .then(response => {
        if (response.ok) return response.json();
        throw new Error('Request failed');
    })
    .then(data => {
        document.getElementById('response').innerText = JSON.stringify(data, null, 2);
    })
    .catch(error => {
        document.getElementById('response').innerText = 'Error: ' + error.message;
    });
}
