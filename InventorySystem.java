<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Warehouse Inventory Monitoring | Nalinaksha M.</title>
  <link rel="stylesheet" href="style.css">
</head>

<body>
  <header class="site-header">
    <a class="brand" href="#home">My Portfolio<span>.</span></a>
    <nav aria-label="Main navigation">
      <a href="#home">Home</a>
      <a href="#about">About</a>
      <a href="#features">Skills</a>
      <a href="#projects">Projects</a>
      <a href="#documentation">Documentation</a>
    </nav>
  </header>

  <main>
    <section class="hero" id="home">
      <div class="hero-copy">
        <p class="eyebrow">JAVA PROJECT PORTFOLIO</p>
        <h1>Warehouse Inventory <span>Monitoring</span> and Stock Reorder System</h1>
        <h2>Java Console Application</h2>
        <p class="intro">A simple inventory management system developed using Java. It helps users add products, view
          available stock, issue products, and check whether an item needs to be reordered.</p>
        <a class="button button-primary" href="#projects">View My Project ↓</a>
      </div>
      <div class="hero-photo-wrap">
        <img class="hero-photo" src="profile-photo.jpg" alt="My profile photo">
        <div class="photo-caption"><span class="photo-caption-dot"></span> JAVA DEVELOPER · STUDENT PORTFOLIO</div>
      </div>
    </section>

    <section class="section" id="about">
      <div class="section-heading">
        <p class="eyebrow">01 / PROJECT OVERVIEW</p>
        <h2>About the <span>Project</span></h2>
      </div>
      <p class="section-description">The Warehouse Inventory Monitoring and Stock Reorder System is a menu-driven Java
        application designed to handle basic warehouse stock operations. The user can add a product by entering its ID,
        name, current quantity, and minimum stock level. The program also allows the user to display products, issue a
        quantity from stock when enough items are available, and check for products that have fallen below their minimum
        level. This project demonstrates the use of classes, objects, ArrayList, loops, conditional statements, methods,
        and user input in Java.</p>
    </section>

    <section class="section" id="features">
      <div class="section-heading">
        <p class="eyebrow">02 / WHAT IT CAN DO</p>
        <h2>Project <span>Features</span></h2>
      </div>
      <div class="feature-grid">
        <article class="feature-card"><span class="feature-symbol">＋</span>
          <h3>Add Product</h3>
          <p>Enter the product ID, product name, available quantity, and minimum stock level to add a new product to the
            list.</p>
        </article>
        <article class="feature-card"><span class="feature-symbol">▤</span>
          <h3>Show Products</h3>
          <p>View the product ID, name, and current quantity of products stored in the application.</p>
        </article>
        <article class="feature-card"><span class="feature-symbol">↘</span>
          <h3>Issue Product</h3>
          <p>Enter a product ID and issue quantity. The program checks stock availability before reducing the quantity.
          </p>
        </article>
        <article class="feature-card"><span class="feature-symbol">!</span>
          <h3>Reorder Check</h3>
          <p>Check stock levels and display a reorder alert when a product quantity is below its minimum level.</p>
        </article>
      </div>
    </section>

    <section class="section project-section" id="projects">
      <div class="section-heading">
        <p class="eyebrow">03 / PROJECT RESOURCES</p>
        <h2>My <span>Project</span></h2>
      </div>
      <p class="section-description">Explore the Java source code, see a sample run of the program, or open the full
        project documentation. Each button opens the related resource.</p>
      <article class="project-card">
        <div class="project-icon">▦</div>
        <p class="resource-label">JAVA · INVENTORY MANAGEMENT</p>
        <h3>Warehouse Inventory Monitoring and Stock Reorder System</h3>
        <p>This project provides a simple menu for adding products, displaying inventory, issuing stock, and checking
          reorder conditions. It is designed as a beginner-friendly Java console application.</p>
        <div class="resource-buttons">
          <a class="button button-primary"
            href="https://github.com/Nalinaksha15/MyPortfolio/blob/main/InventorySystem.java" target="_blank"
            rel="noopener">View GitHub ↗</a>
          <a class="button button-outline" href="output.html" target="_blank" rel="noopener">Output ↗</a>
          <a class="button button-doc" href="Nalinaksha.M_25BIT128.pdf" target="_blank" rel="noopener"
            id="documentation">Documentation ↗</a>
        </div>
        <p class="small-note">The GitHub button will open the Java file after <strong>InventorySystem.java</strong> is
          uploaded to the MyPortfolio repository.</p>
      </article>
    </section>
  </main>

  <footer><span>My Portfolio<span class="orange"></span> &nbsp; Java Project</span><a
      href="https://github.com/Nalinaksha15/MyPortfolio" target="_blank" rel="noopener">GitHub Repository ↗</a></footer>
  <script src="script.js"></script>
</body>

</html>
