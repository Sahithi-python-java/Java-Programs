const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const dotenv = require('dotenv');

// Import routes
const userRoutes = require('./routes/userRoutes');

// Load environment variables
dotenv.config();

const app = express();
const port = process.env.PORT || 3000; // Default port is 3000 if not defined in .env

// Middleware
app.use(cors());  // Enable Cross-Origin Resource Sharing (CORS)
app.use(bodyParser.json());  // For parsing application/json
app.use(bodyParser.urlencoded({ extended: true }));  // For parsing application/x-www-form-urlencoded

// Default root route
//app.get('/', (req, res) => {
//  res.send('Welcome to the API!'); // Respond with a welcome message for the root URL
//});

// Serve static files from the 'public' directory
app.use(express.static('public'));

// Use user routes
app.use('/api/users', userRoutes);  // All user routes start with '/api/users'

// Connect to database
require('./config/db');  // Connect to the database

// Start the server
app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
