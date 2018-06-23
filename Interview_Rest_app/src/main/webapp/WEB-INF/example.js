function b(x, y, a) {
    arguments[2] = 10;
    alert(a);
}
b(1, 2, 3);                // 10



//Какими из перечисленных ниже способов можно проверить, определена ли переменная vRast (укажите все подходящие варианты)?
if (typeof vRast == "undefined") {}



//Что выведет консоль?
console.log( typeof typeof null );  //"string"
// Пояснение: typeof null -> "object"
// typeof "object" - > "string"


//Как с помощью javascript считать свойство age объекта person (выберите все правильные варианты)?
person['age']
person["age"]
person.age


//Чему будет равно значение x[0] и x===y после исполнения данного кода?
var x = [];
var y = x;
y[0] = 7;
// 7 true
//Пояснение: Объекты имеют ссылочный тип. Это значит, что операция присваивания объекта (или массива)
// переменной фактически присваивает ссылку: она не создаёт новую копию объекта. === - сравнение по ссылке



//Как можно уведомить пользователя, что JavaScript отключен в его браузере?
// Разместить внутри тега body следующий код:
//     <noscript><span>У Вас отключён JavaScript...</span></noscript>



//Что выведется в консоль?
var str = 'MyTestingString';
console.log(str.slice(2,8),str.substr(2,8),str.substring(2,8));
//slice(2,8) - Testin (8 не включительно)
//str.substr(2,8) - TestingS (8 + 1 включительно)
//str.substring(2,8) - Testin (8 не включительно)


//Какие примеры кода объявляют функцию exec(string) ? (Выберите все правильные варианты)
var exec = function(string) {};
function exec(string) {}


//Что выведет алерт?
for( var i=0; i<9; i+=2 )
{
    if( ++i==5 ) break;
    else continue;
}
alert( i++ ); //9


//Что будет выведено в консоль?
var aString = { job: "I'm a String!" };
console.log(typeof aString); // object


//Что выведет этот код?
var a = [],
    b = 1,
    c = false,
    d = [];
console.log(typeof (b == c) + ' ' + (a == d) );
//boolean, false
// Пояснение: 1) b == c -> false, typeof false = boolean;
// 2) [ ] == [ ], [ ] === [ ] -> false



// Какая функция используется, если нужно спросить пользователя о чем-то и принять ответ "да" или "нет"?
confirm()


//Чему равно свойство length (в строках a, b) массива r.
var r = ['a', 'l', 'p', 'h'];
r.length = 10; //10
delete r[0];   //10


// <img id="logo" src="companylogo1.gif" height="12" width="12">
//     Что из ниже перечисленного изменит изображение на "companylogo2.gif" при загрузке страницы?
document.getElementById('logo').src="companylogo2.gif"



//Как определить в каком браузере запущен сайт у пользователя?
//Используя объект navigator



var a = '' || 0 || 2 || true || false;
var b = 3 && true && false && null;
console.log (a,b);
//2 false



var nyc = {
    fullName: "New York City",
    mayor: "Bill de Blasio",
    population: 8000000,
    boroughs: 5
};
//Выберите код, который выведет на консоль все значения свойств объекта nyc?
for (var i in nyc){
    console.log(nyc[i]);
}



var multiplesOfEight = [8,16,24,32,40,58];
var answer = multiplesOfEight[ X ] % 8 !== 0; //5



//Каков будет результат выполнения функции?
(function(){
    return typeof arguments;
})();
//"object"



//Что будет выведено на экран следующим кодом?
var a = Array();
a[a.length] = 0;
alert(a.length); // 1
// Пояснение: Создали объект а, так как это массив то у него есть атрибут length
// проинициализироаный нулем a.length = 0, во 2й строчке элементу массива с индексом 0
// присваивают значение 0, в массиве 1 элемент, соответственно a.length = 1.



//Введите имя функции, которая возвращает строку, содержащую информацию, введенную пользователем в диалоговое окно.
// prompt(), prompt


//Какое событие может быть использовано для проверки содержимого поля, которое пользователь покинет нажатием клавиши TAB?
//onblur


//Пояснение: В javascript все переменные объявленные через "var" поднимаются вначало scope(функции или скрипта) и становятся undefined.



String.prototype.compareTo = function(otherObject) {
    // код метода
};
var i = "abc".compareTo("xyz");
// Нужно добавить в стандартный JavaScript объект String метод compareTo().
//     Что должно для этого быть вставлено вместо подчеркивания?



//Выберите кроссбраузерный фрагмент html, который подключает скрипт mootools.js.
//<script type="text/javascript" src="mootools.js"></script>



// Что выведет alert?
    function a() {
        alert(this);
    }
    a.call(null);
//object Window


var a = 1;
var c = a+++1;
//Пояснение: Выражение равносильно следующему: (a++) + 1


var myObj = {
    name: "alex",
};
console.log( myObj.hasOwnProperty('name') );
// Метод hasOwnProperty позволяет нам знать, есть ли у объекта конкретное свойство. В нашем случаи свойство name.


//Какое из перечисленных выражений используется, чтобы определить, включены ли в браузере cookies?
//navigator.cookieEnabled


//Что такое function declaration и function expression?
//Функция, объявленная как Function Declaration, создается интерпретатором до выполнения кода.
// Функцию, объявленную как Function Expression, можно создать и присвоить переменной как обычное значение.


