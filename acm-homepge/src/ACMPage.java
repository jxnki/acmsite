import java.io.FileWriter;
import java.io.IOException;

public class ACMPage {
    public static void main(String[] args) {
        String html = """
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>ACM TKMCE</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: 'Segoe UI', sans-serif;
      background-color: #f5f5f5;
      color: #333;
      line-height: 1.6;
    }
    header {
  background-color: #00274D;
  color: white;
  padding: 2rem 1rem;
  display: flex;
  justify-content: center;
}

.header-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
}
    header img {
      height: 60px;
    }
    .title-nav {
      flex: 1;
      text-align: center;
    }
    header h1 {
      margin: 0;
      font-size: 1.8rem;
    }
    nav {
      margin-top: 0.5rem;
    }
    nav a {
      color: white;
      text-decoration: none;
      margin: 0 10px;
      font-weight: bold;
    }
    .join-top {
      background-color: #0056b3;
      color: white;
      padding: 0.5rem 1rem;
      border-radius: 5px;
      text-decoration: none;
      font-weight: bold;
      font-size: 0.9rem;
    }
      .join-btn {
  background-color: #0056b3;
  padding: 0.4rem 1rem;
  border-radius: 4px;
  color: white;
  text-decoration: none;
  font-weight: bold;
}

    main {
      padding: 1rem;
    }
    section {
      background-color: white;
      padding: 1rem;
      margin-bottom: 1.5rem;
      border-left: 5px solid #00274D;
      box-shadow: 0 0 5px rgba(0, 0, 0, 0.05);
    }
    footer {
      background-color: #00274D;
      color: white;
      text-align: center;
      padding: 1rem;
      font-size: 0.9rem;
    }
    @media (min-width: 768px) {
      header h1 {
        font-size: 2rem;
      }
      nav a {
        margin: 0 15px;
        font-size: 1rem;
      }
      main {
        max-width: 800px;
        margin: auto;
      }
    }
  </style>
</head>
<body>
  <header>
  <div class="header-container">
    <img src="https://india.acm.org/images/acm_rgb_grad_pos_diamond.png" alt="ACM Logo">
    <h1>ACM TKMCE</h1>

    <nav>
      <a href="#about">About</a>
      <a href="#vision">Vision</a>
      <a href="#mission">Mission</a>
      <a class="join-btn" href="https://docs.google.com/forms/d/e/1FAIpQLSf_FwgxA9AquHosp3rKhuE6a-O3RIgMtNY11RNnfyMpl3kueQ/viewform" target="_blank">
        Join Us
      </a>
    </nav>
  </div>
</header>


  <main>
    <section id="about">
      <h2>About ACM</h2>
      <p>ACM TKMCE is the student chapter of the world’s largest computing society — promoting tech, learning, and community.</p>
    </section>

    <section id="vision">
      <h2>Vision</h2>
      <p>To be a leading student chapter driving innovation, collaboration, and tech excellence among students.</p>
    </section>

    <section id="mission">
  <h2>Mission</h2>
  <p>To empower students through events, learning, and real-world tech exposure under ACM's global framework.</p>
  <p><a href="https://www.acm.org/about-acm/mission-vision-values-goals" target="_blank">Read more on ACM.org</a></p>
</section>

  </main>

  <footer>
    <p>&copy; 2025 ACM TKMCE</p>
  </footer>
</body>
</html>
""";

        try {
            FileWriter writer = new FileWriter("index.html");
            writer.write(html);
            writer.close();
            System.out.println("✅ index.html generated successfully.");
        } catch (IOException e) {
            System.out.println("⚠️ Error creating HTML file.");
            e.printStackTrace();
        }
    }
}
