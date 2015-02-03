package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Undefined Instruction
// Category: general/control

object UD2 extends InstructionDefinition("UD2") with UD2Impl

trait UD2Impl {
  implicit object UD2_0 extends UD2._0 {
    val opcode: TwoOpcodes = (0x0F, 0x0B)
  }
}
