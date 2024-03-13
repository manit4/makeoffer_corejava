//we have 3 ways to create variables such as var, let, const

// var x;//this is variable declaration....
// console.log( x );

//console.log( 'This is first js file...')


// var x = 10;
// var namee = 'Manit';
// var statuss = true;

// console.log( x, namee, statuss );




// var x = 10;
// console.log( typeof x )

// var namee = 'Manu';
// console.log( typeof namee )

// var statuss = false;
// console.log( typeof statuss );

// var x;
// console.log( typeof x );

// console.log( typeof 1.2)





// var data1 = 10;
// var data2 = '10';

// console.log( data1 == data2 )




// var data1 = 10;
// var data2 = '10';

// console.log( data1 === data2 )






// var namee = 'Manit';
// console.log( namee.length )



//const val;//as same as final in Java which you can not change and must be initialized...


// const val = 10;
// console.log( 'const value is ', val)
// val = 15;//const variables can b=not be re-assigned with new value...



var name = 'Manu';//the scope of 'var' variables are global and can use anywhere in the file....


// if(true) {

//     let blockVar = 20;
//     var val2 = 30;

//     console.log('blockVar is ', blockVar);
//     console.log('var variable val2 is ', val2);
//     console.log('global variable name is ', name);
// }

// console.log('blockVar outside if is ', blockVar);//block variable with let keyword can not be accessed outside the block.... 





// if(true) {

//     let blockVar = 20;
//     var val2 = 30;

//     console.log('blockVar is ', blockVar);
//     console.log('var variable val2 is ', val2);
//     console.log('global variable name is ', name);
// }

// console.log('var variable val2 outsdie is ', val2);//var variables are not limited to the block...



// var names = []
// console.log(names)




// var names = [ 'Manit', 'Manu', 'Jiangwei', 'Rongjing' ];

// console.log(names)
// console.log( names.length )

// names.push('Kiran');

// console.log('after push() ', names)




// var names = [ 'Manit', 'Manu', 'Jiangwei', 'Rongjing' ];

// console.log(names)

// names.pop();
// console.log(names)







// var names = [ 'Manit', 'Manu', 'Jiangwei', 'Rongjing' ];

// for( var i = 0; i < names.length; i++ ){

//     console.log(names[i])
// }

// console.log( typeof names )//except primitive variables such as number, boolean and string, everything else is an object....







// function display() {

//     console.log( 'I am display()' )
// }

// display();







// function returnValue() {

//     console.log( 'I a returning value');

//     return 10;
// }

// var val = returnValue();
// console.log( 'returned Value is ', val )






// function add( x, y ) {

//     return x + y;
// }

// console.log(add(10, 20));





// function displayValues(x, y) {

//     console.log( x, y);
// }

// displayValues();





// function displayValues(x, y) {

//     console.log( x, y);
// }

// displayValues(10, 20, 30);





// function displayValues(x, y) {

//     console.log( arguments );

//     for(var i = 0; i < arguments.length; i++) {

//         console.log(arguments[i]);
//     }
// }

// displayValues(10, 20, 30, 40);






// var anonymous = function( x ) {
//     console.log( 'hi and the value is ',x );
// }

// anonymous(100);







// function add( x, y ){

//     return x+ y;
// }

// var anonymousFunction = function( y ) {
//     console.log( 'I am anonymous function and the value is ',y );
// }

// var result = add(10, 20);
// anonymousFunction( result )




// function add( x, y, anonymous ){

//     var result = x + y;
//     anonymous( result );
// }

// var anonymousFunction = function( y ) {
//     console.log( 'I am anonymous function and the value is ',y );
// }

// add(50, 100, anonymousFunction);//Here I am passing Anonymous Function as an argument to another function



// function add( x, y, anonymous ){

//     var result = x + y;
//     anonymous( result );
// }

// add(50, 100,  function(y) {
//     console.log( 'I am anonymous function and the value is ',y);
// })





// function add( x, y, anonymous ){

//     var result = x + y;
//     anonymous( result );
// }

// add(50, 100,  (y, z)  => {
//     console.log( 'I am anonymous function and the value is ',y, z );
// })




//object
//  var obj = {};

//  console.log(obj)



// var obj = {
//     name: 'Manit',
//     phone:11111
// };

// console.log(obj)





// var movie = {
//     name: 'Titanic',
//     ratings: 4.8,
//     language: [ 'English', 'Mandarin', 'Hindi' ],
//     actors: [ 'Leo', 'Kate']
// }






// var movie = {
//     name: 'Titanic',
//     ratings: 4.8,
//     language: [ 'English', 'Mandarin', 'Hindi' ],
//     actors: [ 
//         {
//             name: 'Leo',
//             phone: 2222,
//             email: 'leo@gmail.com'
//         },
//         {
//             name: 'Kate',
//             phone: 3333,
//             email: 'kate@gmail.com' 
//         }

//     ]
// }

// console.log( movie )







// var manit = {
//     name:'Manit',
//     age:30,

//     celebrateBirtday: function(){
//         this.age++;
//     }
// }

// console.log(manit);
// manit.celebrateBirtday();

// console.log(manit);







// var manit = {
//     name:'Manit',
//     age:30,

//     celebrateBirtday: function(){
//         this.age++;
//     }
// }

// var kiran = {
//     name:'Kiran',
//     age:24,

//     celebrateBirtday: function(){
//         this.age++;
//     }
// }

// console.log( manit )
// console.log( kiran )







// function human() {
   
// }

// var emptyObj1 = new human();
// var emptyObj2 = new human();
// var emptyObj3 = new human();
// var emptyObj4 = new human();
// console.log(emptyObj1)
// console.log(emptyObj2)
// console.log(emptyObj3)
// console.log(emptyObj4)





// function human( name, age ){

//     this.name = name;
//     this.age = age;
// }


// var manit = new human('Manit', 30);
// console.log( manit )

// var kiran = new human( 'Kiran', 24);
// console.log( kiran )







// function human( name, age ){

//     this.name = name;
//     this.age = age;

//     celebrateBirthday =  function() {
//         this.age++;
//     }
// }


// var manit = new human('Manit', 30);
// manit.celebrateBirthday;
// console.log( manit );




// var names = [ 'Manit', 'Manu', 'Kiran', 'Jiangwei' ];

// names.forEach(function( item ) {

//     console.log( item )
// });




// var names = [ 'Manit', 'Manu', 'Kiran', 'Jiangwei' ];

// var callBack = function( item ) {

//     console.log( item )
// }

// names.forEach( callBack );




// var names = [ 'Manit', 'Manu', 'Kiran', 'Jiangwei' ];

// var newArray = names.filter( function( item ) {
//     return false;
// });

// console.log( newArray )





// var names = [ 'Manit', 'Manu', 'Kiran', 'Jiangwei' ];

// var newArray = names.filter( function( item ) {
//     return item.length >= 6;
// });

// console.log( newArray )






// var names = [ 'Manit', 'Manu', 'Kiran', 'Jiangwei' ];

// var newArray = names.map( function( item ) {
//     return 'First Name is '+ item;
// });

// console.log( newArray )




var names = [ 'Manit', 'Manu', 'Kiran', 'Jiangwei' ];

names.map( function( item ) {
    return 'First Name is '+ item;
}).forEach( function( item ) {
    console.log( item )
})



