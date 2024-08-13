package com.haikal.photos.presentation.photos;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0014B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/haikal/photos/presentation/photos/PhotoListPagingAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/paem/core/entities/Photo;", "Lcom/haikal/photos/presentation/photos/PhotoListPagingAdapter$ViewHolder;", "onItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieComparator", "ViewHolder", "app_debug"})
public final class PhotoListPagingAdapter extends androidx.paging.PagingDataAdapter<com.paem.core.entities.Photo, com.haikal.photos.presentation.photos.PhotoListPagingAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.paem.core.entities.Photo, kotlin.Unit> onItemClick = null;
    
    public PhotoListPagingAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.paem.core.entities.Photo, kotlin.Unit> onItemClick) {
        super(null, null, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.haikal.photos.presentation.photos.PhotoListPagingAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.haikal.photos.presentation.photos.PhotoListPagingAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/haikal/photos/presentation/photos/PhotoListPagingAdapter$MovieComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/paem/core/entities/Photo;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class MovieComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.paem.core.entities.Photo> {
        @org.jetbrains.annotations.NotNull()
        public static final com.haikal.photos.presentation.photos.PhotoListPagingAdapter.MovieComparator INSTANCE = null;
        
        private MovieComparator() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.paem.core.entities.Photo oldItem, @org.jetbrains.annotations.NotNull()
        com.paem.core.entities.Photo newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.paem.core.entities.Photo oldItem, @org.jetbrains.annotations.NotNull()
        com.paem.core.entities.Photo newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/haikal/photos/presentation/photos/PhotoListPagingAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/haikal/photos/databinding/ItemMovieBinding;", "(Lcom/haikal/photos/databinding/ItemMovieBinding;)V", "getBinding", "()Lcom/haikal/photos/databinding/ItemMovieBinding;", "bind", "", "data", "Lcom/paem/core/entities/Photo;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.haikal.photos.databinding.ItemMovieBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.haikal.photos.databinding.ItemMovieBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.haikal.photos.databinding.ItemMovieBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.paem.core.entities.Photo data) {
        }
    }
}