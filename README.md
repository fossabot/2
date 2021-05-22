## About the repo
All the codes  of this exercice are in the app folder.
To achieve the goals,  I use Kotlin, Coroutines, MutableStateFlow, MutableSharedFlow, Koin.
My architecture follows the principle of clean architecture + MVVM + a kind of MVI.
The clean architecture allows me to highly decoupled the code hence maintainable, easily scalable and testable.

I also decouple the project in 4 layers.

 * Domain layer: It contains the [CalculateAmountUseCase (aka Interactor)](https://github.com/segnonna/BinariaTest/blob/main/app/src/main/java/hos/houns/penguinpay/domain/usecases/CalculateAmountUseCase.kt) and the [abstraction of the repository](https://github.com/segnonna/BinariaTest/blob/main/app/src/main/java/hos/houns/penguinpay/domain/usecases/CalculateAmountRepository.kt)


 * Data layer: It contains [the abstraction of RateRemoteDataStore](https://github.com/segnonna/BinariaTest/blob/main/app/src/main/java/hos/houns/penguinpay/data/RateRemoteDataStore.kt),  [the implementations of CalculateAmountRepository](https://github.com/segnonna/BinariaTest/blob/main/app/src/main/java/hos/houns/penguinpay/data/CalculateAmountRepositoryImpl.kt) and [BinaryConverter](https://github.com/segnonna/BinariaTest/blob/main/app/src/main/java/hos/houns/penguinpay/data/BinaryConverter.kt). 
     BinaryConverter class is use to binary to integer  and  vice versa.
     CalculateAmountRepository manage RateRemoteDataStore and BinaryConverter
     
 * Remote layer: it contains [the implementation of RateRemoteDataStore](https://github.com/segnonna/BinariaTest/blob/main/app/src/main/java/hos/houns/penguinpay/remote/RateRemoteDataStoreImpl.kt). All the retrofit under stuff are here.
   
 * Presentation layer: it contains the viewmodel ans the UI (MainFragment). I use a ligth MVI to state representation.
   The MainContract contains alls the intents (aka events) and state
   
I just wrote only one unit test for BinaryConverter. 

Also, not knowing how often the rate changes, I choose to fetch the rate only when the user finished
entering the amount to sent. To do this, [i add a timer in the change listener](https://github.com/segnonna/BinariaTest/blob/77dd2d2467e8112cc698375110f2d5170a34e45b/app/src/main/java/hos/houns/penguinpay/presentation/MainFragment.kt#L228). 

## Next improvement

1. Write UI tests
2. Add Trackers


