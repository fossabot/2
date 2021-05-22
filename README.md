## About the repo
All the codes  of this exercice are in the app folder.
To achieve the goals,  I use Kotlin, Coroutines, MutableStateFlow, MutableSharedFlow, Koin.
My architecture follows the principle of clean architecture + MVVM + a kind of MVI.
The clean architecture allows me to highly decoupled the code hence maintainable, easily scalable and testable.

### MVI
MVI can seems complicated and over-engineering but i decide to use it for couples reasons. MVI imply Unidirectional data flow. This means that:

 * State is passed to the view and to child components
 * Actions (aka Intent or Event) are triggered by the view
 * Actions can update the state
 * The state change is passed to the view and to child components

Unidirectional data flow has some Keys advantages:
 * it’s less error prone, as you have more control over your data
 * it’s easier to debug, as you know what is coming from where
 * it’s more efficient, as the library already knows what the boundaries are of each part of the system


### Clean Architecture
Clean Architecture allows me to design an application that is highly decoupled hence maintainable, easily scalable and testable. 
To do that, I  decouple the project in 4 layers.

 * Domain layer: (Use cases, aka Interactors, aka business services,)

 * Data layer: 
     
 * Remote layer: 
   
 * Presentation layer: 
 
I  write unit tests and has around 80% coverage. 

## Next improvement

1. Write UI tests
2. Add Trackers


