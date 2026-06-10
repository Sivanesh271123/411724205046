console.log("Print statement")
const a=20;
const b=30;
console.log(a+b)
const str="Sivanesh"
console.log(str)
const arr=[1,2,3,4,"string",true]
console.log(arr)
for(let i=0;i<arr.length;i++){
    console.log(arr[i])
}
arr[1]=3.5
console.log(arr[1])
arr.push("new element")
console.log(arr)
arr.pop()
console.log(arr)
function add(a, b) {
    return a + b;
}
function example(){
    console.log("This is an example function")
}
const slow=document.getElementById("slow")
slow.innerText="print statement"
const input=document.getElementById("input")
const output=document.getElementById("inputField")
input.addEventListener("input",()=>{
    output.textContent=input.value
})
const first=document.createElement("h1")
first.textContent="some money"
document.body.appendChild(first)  
first.remove()  