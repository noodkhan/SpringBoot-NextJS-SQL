<h2>Features</h2>
<ul>
    <li>User authentication and role-based access</li>
    <li>Room listing and availability checking</li>
    <li>Booking creation, modification, and cancellation</li>
    <li>Admin dashboard for managing reservations</li>
    <li>REST API for frontend-backend communication</li>
</ul>

<h2>Tech Stack</h2>
<h3>Frontend:</h3>
<ul>
    <li>Next.js (React Framework)</li>
    <li>Axios (API Requests)</li>
    <li>Tailwind CSS (Styling)</li>
</ul>

<h3>Backend:</h3>
<ul>
    <li>Spring Boot (Java Framework)</li>
    <li>Spring Data JPA (Database Interaction)</li>
    <li>Spring Security (Authentication & Authorization)</li>
</ul>

<h3>Database:</h3>
<ul>
    <li>MySQL (Relational Database Management System)</li>
</ul>

<h2>Installation & Setup</h2>
<h3>Prerequisites</h3>
<ul>
    <li>Node.js & npm installed</li>
    <li>Java 17+ installed</li>
    <li>MySQL Server running</li>
</ul>

<h3>1. Clone the Repository</h3>
<pre>
    <code>
        git clone https://github.com/yourusername/room-reservation-system.git
        cd room-reservation-system
    </code>
</pre>

<h3>2. Setup Backend (Spring Boot)</h3>
<pre>
    <code>
        cd backend
        mvn clean install
        mvn spring-boot:run
    </code>
</pre>
<p>The backend will run on <code>http://localhost:8080</code></p>

<h3>3. Setup Frontend (Next.js)</h3>
<pre>
    <code>
        cd frontend
        npm install
        npm run dev
    </code>
</pre>
<p>The frontend will run on <code>http://localhost:3000</code></p>

<h2>API Endpoints</h2>
<h3>Authentication</h3>
<ul>
    <li>POST /api/auth/register – Register a new user</li>
    <li>POST /api/auth/login – Login and get JWT token</li>
</ul>

<h3>Rooms</h3>
<ul>
    <li>GET /api/rooms – Get all available rooms</li>
    <li>POST /api/rooms – Add a new room (Admin only)</li>
</ul>

<h3>Reservations</h3>
<ul>
    <li>POST /api/reservations – Create a new booking</li>
    <li>GET /api/reservations/{id} – Get reservation details</li>
    <li>DELETE /api/reservations/{id} – Cancel a reservation</li>
</ul>

<h2>How It Works</h2>
<ol>
    <li><strong>User Signup/Login</strong> – Users register and log in with JWT authentication.</li>
    <li><strong>Book a Room</strong> – Users browse available rooms and make reservations.</li>
    <li><strong>Admin Panel</strong> – Admin users can add, remove, or update room listings.</li>
    <li><strong>Database Management</strong> – MySQL stores users, rooms, and reservations.</li>
</ol>

<h2>Contributing</h2>
<ol>
    <li>Fork the repository</li>
    <li>Create a feature branch (<code>git checkout -b feature-xyz</code>)</li>
    <li>Commit your changes (<code>git commit -m "Added new feature"</code>)</li>
    <li>Push to the branch (<code>git push origin feature-xyz</code>)</li>
    <li>Create a Pull Request</li>
</ol>

<h2>License</h2>
<p>This project is licensed under the MIT License.</p>

<h2>Contact</h2>
<p>For any questions, reach out to <a href="mailto:your.email@example.com">your.email@example.com</a></p>
