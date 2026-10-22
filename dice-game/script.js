let rollCount = 0;
let highestRoll = 0;
let stats = [0, 0, 0, 0, 0, 0];
let history = [];

// Browser open pannumbodhu random dice
let startNumber = Math.floor(Math.random() * 6) + 1;

document.getElementById("dice").innerHTML =
    '<img src="dice' + startNumber + '.png">';


function rollDice() {

    let number = Math.floor(Math.random() * 6) + 1;
    stats[number - 1]++;

    document.getElementById("statistics").innerHTML =
        "1: " + stats[0] + " | 2: " + stats[1] +
        " | 3: " + stats[2] + "<br>" +
        "4: " + stats[3] + " | 5: " + stats[4] +
        " | 6: " + stats[5];

    if (number > highestRoll) {
        highestRoll = number;
    }

    document.getElementById("highestRoll").textContent = highestRoll;

    let dice = document.getElementById("dice");

    dice.innerHTML =
        '<img src="dice' + number + '.png">';

    // Animation
    dice.classList.remove("rolling");

    void dice.offsetWidth;

    dice.classList.add("rolling");

    // Roll count
    rollCount = rollCount + 1;

    document.getElementById("rollCount").textContent = rollCount;

    // Last rolls
    history.push(number);

    if (history.length > 5) {
        history.shift();
    }

    document.getElementById("history").textContent =
        history.join(", ");

    // Result
    document.getElementById("result").textContent =
        "You rolled " + number;
}


function resetGame() {

    rollCount = 0;
    highestRoll = 0;
    document.getElementById("highestRoll").textContent = "0";
    history = [];

    document.getElementById("history").textContent = "No rolls yet";

    let number = Math.floor(Math.random() * 6) + 1;

    document.getElementById("dice").innerHTML =
        '<img src="dice' + number + '.png">';

    document.getElementById("result").textContent =
        "Roll the dice!";

    document.getElementById("rollCount").textContent = "0";

    document.getElementById("history").textContent = history.join("<br>");

    stats = [0, 0, 0, 0, 0, 0];

    document.getElementById("statistics").innerHTML =
        "1: 0 | 2: 0 | 3: 0<br>" +
        "4: 0 | 5: 0 | 6: 0";
}
