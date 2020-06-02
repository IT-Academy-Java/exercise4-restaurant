const five = 5;
const ten = 10;
const twenty = 20;
const fifty = 50;
const oneHundred = 100;
const twoHundred = 200;
const fiveHundred = 500;
const totalFood = 0;

const menuList = [];
const foodPriceList = [];

let auxMenuList = "Escalivada,Coca recapte,Samfaina,Esqueixada,Trinxat";
let partsAuxMenuList = auxMenuList.split(",")

let auxPriceList = "5,10,10,5,10,15";
let partsAuxPriceList = auxPriceList.split(",");

for (let i = 0; i < 5; i++) {
  menuList.push(partsAuxMenuList[i]);
  foodPriceList.push(partsAuxPriceList[i]);
}

console.log("menuList", menuList);
let menuSelected = [];
let keepAdding = true;

do {
  let chosenDish = prompt("What do you want to eat?\n 1)Escalivada 2) Coca recapte  3)Samfaina  4)Esqueixada  5)Trinxat");
  switch (chosenDish) {
    case "1":
      menuSelected.push("Escalivada");
      break;
    case "2":
      menuSelected.push("Coca recapte");
      break;
    case "3":
      menuSelected.push("Samfaina");
      break;
    case "4":
      menuSelected.push("Esqueixada");
      break;
    case "5":
      menuSelected.push("Trinxant");
      break;
    default:
      console.log('Wrong, try again!!!');
  }

  let answer = prompt("Do you want to continue ordering?\n Si / No");
  if (answer.toUpperCase() === "SI") {
      keepAdding = true;
  } else if(answer.toUpperCase() === "NO"){
      keepAdding = false;
  } else {
      console.log('Wrong answer, try again!');
  }
} while (keepAdding);

console.log("Your ordered:");
console.log("menuSelected", menuSelected)
