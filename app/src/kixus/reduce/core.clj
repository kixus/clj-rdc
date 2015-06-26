(ns kixus.reduce.core
)


;; ------------------------------------------------------------------------------------------------------
(defn reduce-ex
    "Generalized multi-dimensional reduce function. Explicit calls to each dimension (per overloaded definition)"
    ([dm0-obj dm0-trn-fcn]      ;; zero-dimentional reduce; return transformed argument
        (dm0-trn-fcn dm0-obj)
    )
    ([dm0-obj dm0-trn-fcn dm1-lst-fcn]  ;; 1-dimensional reduce; sequentially modify incoming argument
        (let    [   dm0-atm         (atom dm0-obj)
                ]
            (doseq  [   dm1-obj     (dm1-lst-fcn (deref dm0-atm))
                    ]
                (swap! dm0-atm dm0-trn-fcn dm1-obj)
            )
            (deref dm0-atm)
        )
    )
    ([dm0-obj dm0-trn-fcn dm1-lst-fcn dm2-lst-fcn] ;; 2-dimensional reduce
        (let    [   dm0-atm         (atom dm0-obj)
                ]
            (doseq  [   dm1-obj     (dm1-lst-fcn (deref dm0-atm))
                        dm2-obj     (dm2-lst-fcn (deref dm0-atm) dm1-obj)
                    ]
                (swap! dm0-atm dm0-trn-fcn dm1-obj dm2-obj)
            )
            (deref dm0-atm)
        )
    )
    ([dm0-obj dm0-trn-fcn dm1-lst-fcn dm2-lst-fcn dm3-lst-fcn]  ;; 3-dimensional reduce
        (let    [   dm0-atm         (atom dm0-obj)
                ]
            (doseq  [   dm1-obj     (dm1-lst-fcn (deref dm0-atm))
                        dm2-obj     (dm2-lst-fcn (deref dm0-atm) dm1-obj)
                        dm3-obj     (dm3-lst-fcn (deref dm0-atm) dm1-obj dm2-obj)
                    ]
                (swap! dm0-atm dm0-trn-fcn dm1-obj dm2-obj dm3-obj)
            )
            (deref dm0-atm)
        )
    )
)

;; ------------------------------------------------------------------------------------------------------


;; ------------------------------------------------------------------------------------------------------
