console.log("A")
console.log("B")
console.log("C")
// const promise=new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//         resolve("Hi")
//     },2000 )
//     setTimeout(()=>{
//         console.log("done")
//     },0)
    
//     console.log("d")
    

// })

promise.then(res=>{console.log(res)}).catch(err=>{console.log(err)})
console.log(1)
console.log(2)
console.log("hi")
function example1(){
    console.log("HELLO")
}
const example2=()=>{
    const a=1
    const b=2
    console.log(a+b)

}
setTimeout(example1,3000)
setTimeout(example2,450)
