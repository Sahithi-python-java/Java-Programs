// Add an event listener to the form submit event
document.getElementById('userForm').addEventListener('submit', function (event) {
  event.preventDefault(); // Prevent the form from reloading the page

  // Retrieve the form field values
  const username = document.getElementById('username').value;
  const password = document.getElementById('password').value;
  const email = document.getElementById('email').value;
  const age = document.getElementById('age').value;
  const contact_number = document.getElementById('contact_number').value;
  const first_name = document.getElementById('first_name').value;
  const last_name = document.getElementById('last_name').value;

  // Prepare the data object to be sent to the server
  const userData = {
      username,
      password,
      email,
      age,
      contact_number,
      first_name,
      last_name
  };

  // Send a POST request to the server with the user data
  fetch('http://localhost:3000/api/users/register', {
      method: 'POST',
      headers: {
          'Content-Type': 'application/json'
      },
      body: JSON.stringify(userData)
  })
      .then(response => response.json()) // Parse the JSON response
      .then(data => {
          alert('User registered successfully!'); // Notify the user

          // Clear the form fields after successful registration
          document.getElementById('userForm').reset(); // This resets all form inputs to empty
      })
      .catch(error => {
          console.error('Error:', error); // Log any errors
          alert('Error registering user'); // Notify the user about the error
      });
});
