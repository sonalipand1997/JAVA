
import './App.css';
import ChorasList from './components/ChorasList';
import FavList from './components/FavList';
import Footer from './components/Footer';
import MovieList from './components/MovieList';
import Header from './components/Header';



import './CSS/Footer.css'
import './CSS/Header.css'

function App() {
  return (
    <div className="App">

  

      <Header/>
      <div id = "leftbox">
            <h2> <MovieList/></h2>
      </div>
      <div id = "middlebox">
            <h2> <FavList/></h2>
      </div>
     
      <div id = "rightbox">
            <h2> <ChorasList/></h2>
      </div>

      {/* <div>
        <h2><ListOfImages/> </h2>
      </div> */}


     
    </div>

  );
}

export default App;
