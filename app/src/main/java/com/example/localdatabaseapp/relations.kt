import androidx.room.Embedded
import androidx.room.Relation

// data/entities/relations.kt
data class CategoryWithTasks(
    @Embedded val category: CategoryEntity,
    @Relation(
        parentColumn = "category_id",
        entityColumn = "category_id"
    )
    val tasks: List<TaskEntity>
)

data class TaskWithCategory(
    @Embedded val task: TaskEntity,
    @Relation(
        parentColumn = "category_id",
        entityColumn = "category_id"
    )
    val category: CategoryEntity
)
