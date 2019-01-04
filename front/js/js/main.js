var number1 = 32;
var number2 = 40;
console.log(number1 + number2);
console.log("le calcul ne s'effectue pas " + number1 + number2);
console.log(number1 + number2 + " : est bien le résultat de l'opération !");
number1 = "32";
number2 = "40";
console.log(
  parseInt(number1) +
    parseInt(number2) +
    " : est le résultat de l'addition de " +
    number1 +
    " avec " +
    number2
);
number1 = "12.5";
number2 = "2.5";
console.log(
  parseFloat(number1) +
    parseFloat(number2) +
    " : est le résultat de l'addition des nombres décimaux (réels) " +
    number1 +
    " et " +
    number2
);
console.log(124 - 6 * 4 + " : résultat avec la priorité des opérateurs");
console.log(
  (124 - 6) * 4 + " : résultat en forçant les priorités des opérateurs"
);
console.log(Math.round(Math.PI));
console.log(Math.pow(2, 4));
console.log(Math.random());
console.log(Math.max(1, 2, 3, 4, 5));
console.log(Math.min(1, 2, 3, 4, 5));
console.log(Math.sqrt(16));
number1 = 10;
number1++;
console.log(number1);
++number1;
console.log(number1);
number2 = ++number1 * 2;
console.log(number1 + " * 2 avec préincrémentation");
console.log(number2);
number2 = number1++ * 2;
console.log(number1 + " * 2 avec post incrémentation");
console.log(number2);
console.log(number1);
var a = 12;
var b = 5;
a /= b;
console.log(a);
var maChaine = "Ceci est une chaine de caractère !";
console.log(maChaine.length);
console.log(maChaine.toLocaleUpperCase());
console.log(maChaine.indexOf("chaine"));
console.log(maChaine.indexOf("ABC"));
console.log(maChaine.slice(0, 4));
console.log(maChaine.split(" "));
console.log(maChaine.substr(5, 3));
console.log(maChaine.substring(0, 4));
var colors = ["red", "blue", "yellow"];
console.log(colors[2]);
console.log(colors[3]);
var colors2 = new Array("red", "blue", "yellow");
console.log(colors2);
console.log(colors2[0]);
colors[3] = "orange";
console.log(colors);
colors2.push("orange");
console.log(colors2);
colors.splice(1, 0, "black");
console.log(colors);
var numbers = [4, 8, 13, 2];
console.log(numbers[0] + numbers[2]);
console.log(numbers.length);
console.log(numbers.reverse());

// loops

for (var i = 0; i < 10; i++) {
  console.log(i);
}
console.log(i + " après la boucle");
var i = 0;
while (i < 20) {
  console.log(i);
  i++;
}
console.log(i + " après la boucle");

var name = "tata";
do {
  console.log(name);
} while (name == "toto");

var numbers = [55, 23, 32, 25, 18];
numbers.forEach(function(number) {
  console.log(number);
});

for (const key in numbers) {
  console.log(numbers[key]);
}

for (const i of numbers) {
  console.log(i);
}

// if else

var a = 1;
if (a == 1) {
  console.log("condition vérifiée !");
}
var a = "1";
if (a == 1) {
  console.log("condition encore vérifiée !");
}
var a = "1";
if (a !== 1) {
  console.log("condition vérifiée !");
}
if (a === 1) {
  console.log("condition vérifiée");
} else {
  console.log("condition non vérifiée !");
}
var b = 2;
if (a == 1 && b == 2) {
  console.log("both conditions checked");
} else {
  console.log("both conditions aren't checked");
}
if (a === 1 && b === 2) {
  console.log("both conditions checked");
} else {
  console.log("both conditions aren't checked");
}
if (a === 1 || b === 2) {
  console.log("one of the conditions is checked");
} else {
  console.log("none of the conditions is checked");
}

//switch case

var fruit = "apple";
switch (fruit) {
  case "banana":
    console.log("i don't like banana");
    break;
  case "apple":
    console.log("i love apple");
    break;
  case "orange":
    console.log("i like orange");
    break;
  default:
    console.log("i like most of all fruits");
    break;
}

// object literal

var person = {
  lastName: "Dubois",
  firstName: "Jean",
  age: 45,
  children: ["Julien", "Julie"],
  address: {
    city: "Lille",
    zipCode: "59000",
    street: "Pines' street",
    number: 15
  },
  name: function() {
    return this.lastName + " " + this.firstName;
  }
};
console.log(person);
console.log(person.firstName);
console.log(person.children);
console.log(person.children[0]);
console.log(person.address);
console.log(person.address.city);
console.log(person.name());

// object constructor

var apple = new Object();
apple.color = "red";
apple.shape = "round";
apple.description = function() {
  return "This is a nice " + apple.color + " and " + apple.shape + " apple";
};
console.log(apple);
console.log(apple.color);
console.log(apple.description());

// object constructor pattern

function fruits(name, color, shape) {
  this.name = name;
  this.color = color;
  this.shape = shape;
  this.description = function() {
    return (
      "this is a nice " + this.color + " and " + this.shape + " " + this.name
    );
  };
}
var apple = new fruits("apple", "red", "round");
console.log(apple);
var kiwi = new fruits("kiwi", "green", "round");
console.log(kiwi);
console.log(apple.name);
console.log(kiwi.name);
console.log(JSON.stringify(apple) + JSON.stringify(kiwi));
console.log(apple.description());
console.log(apple, kiwi);

// objects list

var users = [
  {
    lastName: "Dubois",
    firstName: "Pierre",
    age: 25
  },
  {
    lastName: "Duprés",
    firstName: "Jean",
    age: 45
  },
  {
    lastName: "Lapierre",
    firstName: "Thomas",
    age: 50
  }
];
console.log(users);
console.log(users[0]);
console.log(users[1].firstName);

//

function doClick() {
  alert("you have just clicked !");
}

function changeText(button) {
  button.innerHTML = "You have clicked !";
}

function changeText() {
  var mainTitle = document.getElementById("title");
  mainTitle.innerHTML = "nice !";
}

function showDate() {
  var time = document.getElementById("date");
  time.innerHTML = Date();
}

function trans() {
  var newP = document.getElementById("p");
  newP.innerHTML = "JS is an interpreted language ...";
}

function changeBackground(x) {
  console.log(x.value);
  var e = document.getElementById("js");
  e.style.color = x.value;
}

function validateForm() {
  var lastName = document.forms[0][0].value;
  if (lastName == null || lastName == "") {
    alert("name is required");
    return false;
  }
  if (lastName.length < 3) {
    alert("name is too short");
    return false;
  }
}

// higher order functions

const companies = [
  {
    name: "Capgemini",
    industry: "computing",
    created: "1957",
    ended: 2019
  },
  {
    name: "Atos",
    industry: "computing",
    created: "1970",
    ended: 2019
  },
  {
    name: "Tesla",
    industry: "electric cars",
    created: "2000",
    ended: 2019
  },
  {
    name: "Auchan",
    industry: "retail",
    created: "1980",
    ended: 2019
  },
  {
    name: "Amazon",
    industry: "cloud",
    created: "1990",
    ended: 2019
  }
];

const ages = [25, 45, 76, 80, 10, 5, 8, 90, 3, 33, 69];

var majeur = [];
for (let i = 0; i < ages.length; i++) {
  if (ages[i] >= 18) {
    majeur.push(ages[i]);
  }
}
console.log(majeur);
const majeur2 = ages.filter(function(age) {
  if (age >= 18) {
    return true;
  }
});
console.log(majeur2);

const majeurs = ages.filter(age => age >= 18);
console.log(majeurs);

const computingCompanies = companies.filter(function(company) {
  if (company.industry === "computing") {
    return true;
  }
});
console.log(computingCompanies);

const computingCompanies2 = companies.filter(
  company => company.industry === "computing"
);
console.log(computingCompanies2);

const companies80 = companies.filter(company => company.created == 1980);
console.log(companies80);

const companies90 = companies.filter(
  company => company.created > 1980 && company.created < 2000
);
console.log(companies90);

const companiesNames = companies.map(function(company) {
  return company.name;
});
console.log(companiesNames);

const companiesNames2 = companies.map(company => company.name);
console.log(companiesNames2);

const sqrtAges = ages.map(age => Math.sqrt(age));
console.log(sqrtAges);

const doubleAges = ages.map(age => age * 2);
console.log(doubleAges);

const test = companies
  .filter(company => company.created >= 1980 && company.created <= 2000)
  .map(company => company.name);
console.log(test);

const companiesSorted = companies.sort(function(c1, c2) {
  if (c1.created > c2.created) {
    return 1;
  }
  return -1;
});
console.log(companiesSorted);

const companiesSorted2 = companies.sort((c1, c2) =>
  c1.created > c2.created ? 1 : -1
);
console.log(companiesSorted2);

const agesAscSort = ages.sort((a, b) => a - b);
console.log(agesAscSort);

const agesDescSort = ages.sort((a, b) => b - a);
console.log(agesDescSort);

var sumAges = 0;
for (let i = 0; i < ages.length; i++) {
  sumAges += ages[i];
}
console.log(sumAges);

const sumAges2 = ages.reduce(function(total, age) {
  return total + age;
}, 0);
console.log(sumAges2);

const sumAges3 = ages.reduce((total, age) => total + age, 0);
console.log(sumAges3);

const lifetimeSum = companies.reduce(function(total, company) {
  return total + (company.ended - company.created);
}, 0);
console.log(lifetimeSum);

const lifetimeSum2 = companies.reduce(
  (total, company) => total + (company.ended - company.created),
  0
);
console.log(lifetimeSum2);

const test2 = ages
  .map(age => age * 2)
  .filter(age => age > 60)
  .sort((a, b) => a - b)
  .reduce((a, b) => a + b, 0);
console.log(test2);

// arrow function

var x = function(a) {
  return a;
};
var x = a => a;

var x = () => {
  console.log("hello");
};
x();

var x = (a, b, c) => a + b + c;
console.log(x(10, 5, 3));
