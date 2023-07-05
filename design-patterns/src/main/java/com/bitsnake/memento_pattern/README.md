### What is Memento Pattern?

* In your application, you may need to support “undo” operations. To achieve this,
  you need to record the internal state of an object. So, you must save this state
  information in a place that can be referred again to revert back the old state of the
  object. But in general, objects encapsulate their states, and those states are
  inaccessible to the outer world. So, if you expose the state information, then you
  violate encapsulation.
  The dictionary meaning of memento is reminder (of past events). So, you can
  guess that using this pattern, you can restore an object to its previous state, but it
  ensures that you achieve your goal without violating the encapsulation.