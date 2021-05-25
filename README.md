![example workflow](https://github.com/segnonna/DVT-Weather-App/actions/workflows/build.yml/badge.svg)
[![Code Grade](https://www.code-inspector.com/project/22937/status/svg)](https://frontend.code-inspector.com/public/project/22937/DVT-Weather-App/dashboard)
## About the repo (DVT Assesment )
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
 
 * Device layer: 

 * Local layer: 
 
I  write unit tests and has around 80% coverage. 

I set Github Actions to build each time i push on main. I could do better by following GitFlow proccess.

## Good points

![Code quality](https://github.com/segnonna/DVT-Weather-App/blob/main/code_quality.png)
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fsdadadas12%2F2.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fsdadadas12%2F2?ref=badge_shield)

![Code quality](https://github.com/segnonna/DVT-Weather-App/blob/main/code_quality_2.png)

## Next improvement



1. Write UI tests
2. Add Trackers




## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fsdadadas12%2F2.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Fsdadadas12%2F2?ref=badge_large)