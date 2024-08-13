package com.haikal.photos.presentation.photos;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/haikal/photos/presentation/photos/PhotosViewModel;", "Lcom/paem/core/base/BaseViewModel;", "()V", "repo", "Lcom/paem/core/data/PhotosRepository;", "getPhotoPagination", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/paem/core/entities/Photo;", "app_debug"})
public final class PhotosViewModel extends com.paem.core.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.paem.core.data.PhotosRepository repo = null;
    
    public PhotosViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.paem.core.entities.Photo>> getPhotoPagination() {
        return null;
    }
}