package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Fast System Call
// Category: general/branch

object SYSCALL extends InstructionDefinition("SYSCALL") with SYSCALLImpl

trait SYSCALLImpl {
  implicit object SYSCALL_0 extends SYSCALL._0 {
    val opcode: TwoOpcodes = (0x0F, 0x05)
    override def hasImplicitOperand = true
  }
}
