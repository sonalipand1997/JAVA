import logo from './logo.svg';
import './App.css';


import './CSS/Footer.css'
import './CSS/Header.css'
import Header from './components/Header';
import Footer from './components/Footer';
import ClassComponent from './components/ClassComponent';

import MyFunction from './components/MyFunction';
import RandomImage from './components/RandomImage';
import Movie from './components/Movie';
import Demo from './components/Demo';
import Home from './components/Home';
import Create from './components/Create';
import ChoreList from './components/ChoreList';
import ChoreList2 from './components/ChoreList2';






function App() {
  return (
    <div className="App">
     
        <Header></Header>
      <Footer></Footer>
  <ClassComponent></ClassComponent>
   
  <Create></Create> 
  <Demo></Demo> ]
 <Home></Home>
  <Movie></Movie> 
   <MyFunction></MyFunction> 
<RandomImage ></RandomImage> 

<ChoreList></ChoreList>
<ChoreList2></ChoreList2> 



    </div>
  );
}

export default App;
