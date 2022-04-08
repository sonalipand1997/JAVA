
 function ChoreList(){
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

    let TotalChores=Yesterday.length+Today.length+Tomorrow.length;
    console.log(TotalChores);

    let finalChores=Yesterday.length+Today.length;
    console.log(finalChores);


    return (
        
 <div style={{"background-color": "", "float": "right", "width":"30%"}}>

{(() => {

if (TotalChores.length >finalChores.length) {

  return (

    <div>Work Harder.</div>

  )

} else if (TotalChores == 0 ||finalChores.length - TotalChores>2) {

  return (

    <div>No allowance yet</div>

  )

}
else if (TotalChores == 0 ||finalChores.length - TotalChores>3) {

    return (
  
      <div>Ice Cream Treat</div>
  
    )
  
  }


else {

  return (

    <div>
        
        <h3>To earn ice cream treat:</h3>
        <p>The chores list must be empty</p>
        <p>The done list must have at least 4 items</p>
    </div>

  )

}

})()}

        <h3>Yesterday's Chores</h3>
       {Yesterday.map(data=>(

    <li style={{"textAlign":"left"}}>{data.name}</li>              
       )
        )}
        <h3>Today's Chores</h3>
        {Today.map(data=>(

  <li style={{"textAlign":"left"}}>{data.name}</li>              
   )
    )}
    <h3>Tomorrow's Chores</h3>

    {Tomorrow.map(data=>(

<li style={{"textAlign":"left"}}>{data.name}</li>              
   )
    )}
        </div>
    )
 }
export default ChoreList

