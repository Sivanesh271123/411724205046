let messages = [];

const input = document.getElementById("messageInput");
const addBtn = document.getElementById("addBtn");
const clearBtn = document.getElementById("clearBtn");
const count = document.getElementById("count");
const status = document.getElementById("status");
const messagesDiv = document.getElementById("messages");

// Character Count

input.addEventListener("input",function(){

    count.textContent="Characters : "+input.value.length;

});

// Display Messages

function displayMessages(){

    messagesDiv.innerHTML="";

    messages.forEach(function(msg,index){

        const card=document.createElement("div");

        card.classList.add("message");

        card.innerHTML=`
            <h3>💌 Message ${index+1}</h3>
            <p>${msg}</p>
        `;

        messagesDiv.appendChild(card);

    });

}

// Add Button

addBtn.addEventListener("click",function(){

    const text=input.value.trim();

    const promise=new Promise(function(resolve,reject){

        if(text.length>=3){

            resolve(text);

        }

        else{

            reject("Message must contain at least 3 characters");

        }

    });

    promise.then(function(msg){

        status.style.color="#7CFC00";
        status.innerHTML="✅ Message Added Successfully";

        messages.push(msg);

        displayMessages();

        input.value="";

        count.textContent="Characters : 0";

        setTimeout(function(){

            const index=messages.indexOf(msg);

            if(index!=-1){

                messages.splice(index,1);

                displayMessages();

                status.style.color="#FFD54F";
                status.innerHTML="⌛ Message Expired";

            }

        },10000);

    })

    .catch(function(error){

        status.style.color="#ff5252";

        status.innerHTML="❌ "+error;

    });

});

// Clear Button

clearBtn.addEventListener("click",function(){

    messages=[];

    displayMessages();

    status.style.color="#40C4FF";

    status.innerHTML="🗑 All Messages Cleared";

});