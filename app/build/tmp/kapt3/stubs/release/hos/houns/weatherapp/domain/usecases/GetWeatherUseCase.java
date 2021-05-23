package hos.houns.weatherapp.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase;", "", "repository", "Lhos/houns/weatherapp/data/GetWeatherRepository;", "(Lhos/houns/weatherapp/data/GetWeatherRepository;)V", "execute", "Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase$GetWeatherResult;", "latitude", "", "longitude", "(Ljava/lang/Double;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetWeatherResult", "app_release"})
public final class GetWeatherUseCase {
    private final hos.houns.weatherapp.data.GetWeatherRepository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object execute(@org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hos.houns.weatherapp.domain.usecases.GetWeatherUseCase.GetWeatherResult> p2) {
        return null;
    }
    
    public GetWeatherUseCase(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.data.GetWeatherRepository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase$GetWeatherResult;", "", "()V", "Error", "Success", "Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase$GetWeatherResult$Success;", "Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase$GetWeatherResult$Error;", "app_release"})
    public static abstract class GetWeatherResult {
        
        private GetWeatherResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase$GetWeatherResult$Success;", "Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase$GetWeatherResult;", "value", "Lhos/houns/weatherapp/domain/entity/WeatherUiModel;", "(Lhos/houns/weatherapp/domain/entity/WeatherUiModel;)V", "getValue", "()Lhos/houns/weatherapp/domain/entity/WeatherUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class Success extends hos.houns.weatherapp.domain.usecases.GetWeatherUseCase.GetWeatherResult {
            @org.jetbrains.annotations.NotNull()
            private final hos.houns.weatherapp.domain.entity.WeatherUiModel value = null;
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.entity.WeatherUiModel getValue() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.entity.WeatherUiModel value) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.entity.WeatherUiModel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.usecases.GetWeatherUseCase.GetWeatherResult.Success copy(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.entity.WeatherUiModel value) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase$GetWeatherResult$Error;", "Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase$GetWeatherResult;", "error", "Lhos/houns/weatherapp/domain/core/Failure;", "(Lhos/houns/weatherapp/domain/core/Failure;)V", "getError", "()Lhos/houns/weatherapp/domain/core/Failure;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class Error extends hos.houns.weatherapp.domain.usecases.GetWeatherUseCase.GetWeatherResult {
            @org.jetbrains.annotations.NotNull()
            private final hos.houns.weatherapp.domain.core.Failure error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.core.Failure getError() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.core.Failure error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.core.Failure component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.usecases.GetWeatherUseCase.GetWeatherResult.Error copy(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.core.Failure error) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}