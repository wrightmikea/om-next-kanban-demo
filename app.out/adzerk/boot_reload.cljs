(ns adzerk.boot-reload (:require [adzerk.boot-reload.client :as client] kanban.app))
(client/connect "ws://localhost:37841" {:on-jsload (fn* [] (kanban.app/run))})