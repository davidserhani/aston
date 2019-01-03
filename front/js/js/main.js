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
