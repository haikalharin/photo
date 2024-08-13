package com.haikal.photos.presentation.photos;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u0016\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/haikal/photos/presentation/photos/PhotosActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/haikal/photos/databinding/ActivityPhotosBinding;", "getBinding", "()Lcom/haikal/photos/databinding/ActivityPhotosBinding;", "binding$delegate", "Lkotlin/Lazy;", "moviesAdapter", "Lcom/haikal/photos/presentation/photos/PhotoListPagingAdapter;", "vm", "Lcom/haikal/photos/presentation/photos/PhotosViewModel;", "getVm", "()Lcom/haikal/photos/presentation/photos/PhotosViewModel;", "vm$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupLoadingState", "showPhotos", "photoList", "Landroidx/paging/PagingData;", "Lcom/paem/core/entities/Photo;", "Companion", "app_debug"})
public final class PhotosActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy vm$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.haikal.photos.presentation.photos.PhotoListPagingAdapter moviesAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_GENRE_ID = "KEY_GENRE_ID";
    @org.jetbrains.annotations.NotNull()
    public static final com.haikal.photos.presentation.photos.PhotosActivity.Companion Companion = null;
    
    public PhotosActivity() {
        super();
    }
    
    private final com.haikal.photos.presentation.photos.PhotosViewModel getVm() {
        return null;
    }
    
    private final com.haikal.photos.databinding.ActivityPhotosBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showPhotos(androidx.paging.PagingData<com.paem.core.entities.Photo> photoList) {
    }
    
    private final void setupLoadingState() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/haikal/photos/presentation/photos/PhotosActivity$Companion;", "", "()V", "KEY_GENRE_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}