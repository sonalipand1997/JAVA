import React from 'react'
class Demo extends React.Component{
 constructor(props){
   super(props);
   this.state={color:"red"}
 }

 componentDidMount(){
   setTimeout(()=>{
        this.setState({color:"pink"})
   },2000)
 }

 render(){
   return(
      <div>
        <h1>color is {this.state.color}</h1>
      </div>
   )
 }
}
export default Demo;