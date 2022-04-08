import React from 'react'




function ChoreList2(){
  const  Yesterday=[
    {name:'Empty Dishwasher'},
    {name:'Complete LunchCode prep work'},
    {name:'Buy groceries'}
  ];
  const Today=[
    {name:'Load dishwasher'},
    {name:'Finish LaunchCode prep work'},
    {name:'Buy the groceries you forgot'}
  ];
const Tomorrow=[
    {name:"Empty dishwasher again"},
    {name:"play with LunchCode practice code"},
    {name:"groceries,Again"}
]
return (
    <div style={{"float":"right"}}>
      <h3 style={{"textAlign":"right", "marginRight":"100px"}}>Yesterday Chores:  </h3>
       {Yesterday.map(data=>(
        <li style={{"textAlign":"right","marginRight":"100px"}}>{data.name}</li>              
         )
        )}
     <h3 style={{"textAlign":"right", "marginRight":"100px"}}>Today Chores:  </h3>
     {Today.map(data=>(

    <li style={{"textAlign":"right", "marginRight":"100px"}}>{data.name}</li>              
   )
    )}
 <h3 style={{"textAlign":"right","marginRight":"100px"}}>Tomorrow Chores:  </h3>

{  Tomorrow.map(data=>(

<li style={{"textAlign":"right","marginRight":"100px"}}>{data.name}</li>              
)
)}



    </div>
)
}

export default ChoreList2