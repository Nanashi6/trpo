import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class StudentsUI extends JFrame {

    private final Repository _repository;
    private final JLabel nameLabel;
    private final JTextField nameTextField;
    private final JLabel ageLabel;
    private final JTextField ageTextField;
    private final JLabel idLabel;
    private final JTextField idTextField;
    private final JLabel gpaLabel;
    private final JTextField gpaTextField;
    private final JCheckBox isBudgetCheckBox;

    private final JButton addButton;
    private final JButton updateButton;
    private final JButton removeButton;

    private final JTable table;

    public StudentsUI(Repository repository) {
        super("Repository Form");

        _repository = repository;

        nameLabel = new JLabel("Name: ");
        nameTextField = new JTextField(20);
        ageLabel = new JLabel("Age: ");
        ageTextField = new JTextField(20);
        idLabel = new JLabel("ID: ");
        idTextField = new JTextField(20);
        gpaLabel = new JLabel("GPA: ");
        gpaTextField = new JTextField(20);
        isBudgetCheckBox = new JCheckBox("Is Budget");

        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        removeButton = new JButton("Remove");

        String[] columns = {"Name", "Age", "ID", "GPA", "Is Budget"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);

        JPanel formPanel = new JPanel(new GridLayout(6, 2));
        formPanel.add(nameLabel);
        formPanel.add(nameTextField);
        formPanel.add(ageLabel);
        formPanel.add(ageTextField);
        formPanel.add(idLabel);
        formPanel.add(idTextField);
        formPanel.add(gpaLabel);
        formPanel.add(gpaTextField);
        formPanel.add(new JLabel());
        formPanel.add(isBudgetCheckBox);
        formPanel.add(addButton);
        formPanel.add(updateButton);
        formPanel.add(removeButton);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(formPanel, BorderLayout.NORTH);
        container.add(scrollPane, BorderLayout.CENTER);

        addButton.addActionListener(e -> addStudent());
        updateButton.addActionListener(e -> updateStudent());
        removeButton.addActionListener(e -> removeStudent());

        pack();

        JOptionPane.showMessageDialog(this, "Сейчас вы увидите интуитивно понятный интерфейс");
        JOptionPane.showMessageDialog(this, "Во время разработки автор находился в трезвом уме");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addStudent() {
        Student student;
        String name = nameTextField.getText();
        int age = Integer.parseInt(ageTextField.getText());
        int id = Integer.parseInt(idTextField.getText());
        double gpa = Double.parseDouble(gpaTextField.getText());
        boolean isBudget = isBudgetCheckBox.isSelected();
        if (isBudget)
            student = new BudgetStudent(name, age, id, gpa);
        else
            student = new Student(name, age, id, gpa);
        _repository.addStudent(student);
        refreshTable();
    }

    private void updateStudent() {
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        String name = nameTextField.getText();
        int age = Integer.parseInt(ageTextField.getText());
        int id = Integer.parseInt(idTextField.getText());
        double gpa = Double.parseDouble(gpaTextField.getText());
        boolean isBudget = isBudgetCheckBox.isSelected();
        Student student = isBudget ? new BudgetStudent(name, age, id, gpa) : new Student(name, age, id, gpa);
        _repository.updateStudent(selectedRowIndex, student);
        refreshTable();
    }

    private void removeStudent() {
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to remove.");
            return;
        }
        _repository.removeStudent(selectedRowIndex);
        refreshTable();
    }

    private void refreshTable() {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        ArrayList<Student> students = _repository.getArray();
        for (Student student : students) {
            Object[] rowData = {student.getName(), student.getAge(), student.getId(), student.getGpa(), student instanceof BudgetStudent};
            tableModel.addRow(rowData);
        }
    }

    public static void main(String[] args) {
        StudentsUI fr = new StudentsUI(new Repository());
    }
}
