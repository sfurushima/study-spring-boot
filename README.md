
## gradle設定
gradleファイルに設定後、Springを起動してもうまく表示できない場合は、 gradleファイルの取り込みがつまくできていない可能性が高い。
`Load Gradle Changes`を実行してみる。


## 3層アーキテクチャの説明

* 構造
  * プレゼンテーション層
    * 画面からの入力/画面への出力
      * 利用アノテーション）@Controller
  * ビジネスロジック層
    * 業務ロジック、業務ルール
      * 利用アノテーション）@Service
  * データアクセス層
    * データの保存、取得
      * 利用アノテーション）@Repository
* 説明
  * このなかで重要な層は、ビジネスロジック層
    * ここでアプリケーション方針を決めているため
  * プレゼンテーション層/データアクセス層と分断しているのは、アプリケーションの行動を整理することが目的。
    * ビジネスロジック層に表示出力に関わる処理が混じらない/データ
    * データアクセス層にデータの永続化についての処理が混じらないようにする
  * 仮に、全てビジネスロジック層が作用すると、表示処理とロジック層の処理が混じり合いカオスなソースになる。

## DI:Dependency Injection（依存性の注入）
* 語義の説明
  * 依存性：使いたいオブジェクトを
  * 注入：直接new()せず、外部から渡してもらうようにする
  * というデザインパターン。
* 依存とは？
  * **クラスのなかで、クラスが使われている** ということ
  * 例）
    * IssueController内で、IssuesServiceを呼び出している処理があるとき
    * ［IssueControllerはIssuesServiceに依存している］と捉える
* 直接newせず、外部からもらうということは？
  * DIなし
    * ```
      private final IssueService issueService = new IssueService();
      ```
      のように、new()する必要がある。
  * DIあり
    * ```
      private final IssueController issueService;
      public IssuerController(IssueService issueService) {
        this.issueService = issueService;
      }
      ```
      コンストラクタを呼び出す側でnewしてもらう
  * memo
    * DIの仕方は、Constructor以外にもある
* メリット
  * new()しないことで、疎結合にすることができる
    * new()することは密結合になる。
    * どういうことか？
      * IssueControllerでIssueServiceをnewするとき、IssueServiceの実装詳細を知らないといけないなど、利用アプリケーションの詳細を知らないといけない。
    * 疎結合であることで、拡張性が高く、テストしやすいコードになる
* SpringでのDI
  * Bean登録 + インジェクションの受け口を準備
    * ```
      @Service
      public class IssueService {
      ```
      でBean登録（Javaクラス）
    * SpringのDIでは、DIコンテナというコンポーネントにBeanを登録することで、Beanの生成処理やインジェクションをDIコンテナに委譲する
    * インジェクションの受け口を準備（引数ありのConstructorを準備すること）
* アノテーション種類
  * `@Component`
    * 付与したクラスがBeanであることを示す
  * 各ユースケースを表すアノテーションもある
    * `@Controller`：プレゼンテーション層
    * `@Service`：ビジネスロジック層
    * `@Repository`：データアクセス層
    * 上記3つをまとめたのが`@Component`になるが、どういったユースケースで利用しているかをわかりやすくするため、Componentはあまり使わずに、ユースケース別のアノテーションを利用する。