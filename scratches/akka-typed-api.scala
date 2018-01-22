mport akka.typed.persistence.scaladsl.PersistentActor
import akka.typed.Behavior

object BlogPost1 {

  def behavior: Behavior[BlogCommand] =
    PersistentActor.immutable[BlogCommand, BlogEvent, BlogState](
      persistenceId = "abc",
      initialState = BlogState.empty,
      actions = PersistentActor.Actions { (ctx, cmd, state) ⇒ ??? },
      applyEvent = (evt, state) ⇒ ???)

}
