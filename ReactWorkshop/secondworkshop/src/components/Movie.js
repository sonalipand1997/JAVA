

 function Movie(){
    const List=[

        {name:'The manchurian Candidate'},
        {name:'Complete LunchCode prep work'},
        {name:'Buy groceries'}
    ];
    return (
        <div style={{"background-color": "", "float": "left", "width":"30%"}}>
            <h3> Movie to watch</h3>
            <center>
            <ol>
             {List.map(data=>(
            <li style={{"textAlign":"left"}}>{data.name}</li>  
       )
        )}
        </ol>
            </center>
        </div>
    )
 }
export default Movie
