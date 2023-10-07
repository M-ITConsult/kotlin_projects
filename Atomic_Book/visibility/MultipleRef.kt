package visibility

class MultipleRef {
    class Counter(private var start: Int) {
        fun increment() {
            start++
        }
        override fun toString() = start.toString()
    }

    class CounterHolder(counter: Counter) {
        private val ctr = counter
        override fun toString() = "CounterHolder: $ctr"
    }
}